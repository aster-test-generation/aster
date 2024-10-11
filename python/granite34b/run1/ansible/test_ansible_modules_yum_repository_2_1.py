import os
import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.six.moves import configparser
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=YumRepo.argument_spec,
            supports_check_mode=True
        )
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, self.module.params['repoid'])
        repos_dir = self.module.params['reposdir']
        self.assertEqual(self.yum_repo.params['dest'], os.path.join(repos_dir, '%s.repo' % self.module.params['file']))
        if os.path.isfile(self.yum_repo.params['dest']):
            self.yum_repo.repofile.read(self.yum_repo.params['dest'])

    def test_read_repofile(self):
        self.yum_repo.read_repofile()
        self.assertIsInstance(self.yum_repo.repofile, configparser.ConfigParser)

    def test_write_repofile(self):
        self.yum_repo.write_repofile()
        self.assertTrue(os.path.isfile(self.yum_repo.params['dest']))

    def test_delete_repofile(self):
        self.yum_repo.delete_repofile()
        self.assertFalse(os.path.isfile(self.yum_repo.params['dest']))

    def test_get_section_value(self):
        self.yum_repo.read_repofile()
        self.assertEqual(self.yum_repo.get_section_value('name'), 'epel')
        self.assertEqual(self.yum_repo.get_section_value('baseurl'), 'https://download.fedoraproject.org/pub/epel/$releasever/$basearch/')
        self.assertEqual(self.yum_repo.get_section_value('enabled'), '1')

    def test_set_section_value(self):
        self.yum_repo.read_repofile()
        self.yum_repo.set_section_value('enabled', '0')
        self.yum_repo.write_repofile()
        self.yum_repo.read_repofile()
        self.assertEqual(self.yum_repo.get_section_value('enabled'), '0')

    def test_delete_section(self):
        self.yum_repo.read_repofile()
        self.yum_repo.delete_section()
        self.yum_repo.write_repofile()
        self.yum_repo.read_repofile()
        self.assertFalse(self.yum_repo.repofile.has_section(self.yum_repo.section))

if __name__ == '__main__':
    unittest.main()