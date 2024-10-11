import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native
from ansible.modules.yum_repository import YumRepo


class TestYumRepository(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=resource.argument_spec,
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
        self.assertEqual(self.yum_repo.repofile.read(self.yum_repo.params['dest']), self.yum_repo.repofile.read(self.yum_repo.params['dest']))

    def test_write_repofile(self):
        self.yum_repo.write_repofile()
        self.assertEqual(self.yum_repo.repofile.read(self.yum_repo.params['dest']), self.yum_repo.repofile.read(self.yum_repo.params['dest']))

    def test_get_config(self):
        self.yum_repo.get_config()
        self.assertEqual(self.yum_repo.config, self.yum_repo.config)

    def test_set_config(self):
        self.yum_repo.set_config()
        self.assertEqual(self.yum_repo.config, self.yum_repo.config)

    def test_get_value(self):
        self.yum_repo.get_value()
        self.assertEqual(self.yum_repo.value, self.yum_repo.value)

    def test_set_value(self):
        self.yum_repo.set_value()
        self.assertEqual(self.yum_repo.value, self.yum_repo.value)

    def test_get_section(self):
        self.yum_repo.get_section()
        self.assertEqual(self.yum_repo.section, self.yum_repo.section)

    def test_set_section(self):
        self.yum_repo.set_section()
        self.assertEqual(self.yum_repo.section, self.yum_repo.section)

    def test_get_repofile(self):
        self.yum_repo.get_repofile()
        self.assertEqual(self.yum_repo.repofile, self.yum_repo.repofile)

    def test_set_repofile(self):
        self.yum_repo.set_repofile()
        self.assertEqual(self.yum_repo.repofile, self.yum_repo.repofile)

    def test_get_dest(self):
        self.yum_repo.get_dest()
        self.assertEqual(self.yum_repo.dest, self.yum_repo.dest)

    def test_set_dest(self):
        self.yum_repo.set_dest()
        self.assertEqual(self.yum_repo.dest, self.yum_repo.dest)

    def test_get_state(self):
        self.yum_repo.get_state()
        self.assertEqual(self.yum_repo.state, self.yum_repo.state)

    def test_set_state(self):
        self.yum_repo.set_state()
        self.assertEqual(self.yum_repo.state, self.yum_repo.state)

    def test_get_params(self):
        self.yum_repo.get_params()
        self.assertEqual(self.yum_repo.params, self.yum_repo.params)

if __name__ == '__main__':
    unittest.main()