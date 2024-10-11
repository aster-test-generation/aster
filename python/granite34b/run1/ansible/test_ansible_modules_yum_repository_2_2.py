import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native
from ansible.modules.yum_repository import YumRepo


class TestYumRepository(unittest.TestCase):

    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=YumRepo.argument_spec,
            supports_check_mode=True
        )
        self.yumrepo = YumRepo(self.module)

    def test_add_repo(self):
        self.yumrepo.add()
        self.assertTrue(self.yumrepo.repofile.has_section(self.yumrepo.section))

    def test_remove_repo(self):
        self.yumrepo.remove()
        self.assertFalse(self.yumrepo.repofile.has_section(self.yumrepo.section))

    def test_modify_repo(self):
        self.yumrepo.modify()
        self.assertEqual(self.yumrepo.repofile.get(self.yumrepo.section, 'baseurl'), self.params['baseurl'])

    def test_get_repo_data(self):
        repo_data = self.yumrepo.get_repo_data()
        self.assertEqual(repo_data['baseurl'], self.params['baseurl'])

    def test_get_repo_file(self):
        repo_file = self.yumrepo.get_repo_file()
        self.assertEqual(repo_file, self.params['dest'])

    def test_get_repo_path(self):
        repo_path = self.yumrepo.get_repo_path()
        self.assertEqual(repo_path, self.params['dest'])

    def test_get_repos_dir(self):
        repos_dir = self.yumrepo.get_repos_dir()
        self.assertEqual(repos_dir, self.params['reposdir'])

    def test_get_section(self):
        section = self.yumrepo.get_section()
        self.assertEqual(section, self.params['repoid'])

    def test_get_value(self):
        value = self.yumrepo.get_value('baseurl')
        self.assertEqual(value, self.params['baseurl'])

    def test_has_section(self):
        has_section = self.yumrepo.has_section()
        self.assertTrue(has_section)

    def test_read_repo_file(self):
        self.yumrepo.read_repo_file()
        self.assertEqual(self.yumrepo.repofile.get(self.yumrepo.section, 'baseurl'), self.params['baseurl'])

    def test_write_repo_file(self):
        self.yumrepo.write_repo_file()
        with open(self.yumrepo.repo_file, 'r') as f:
            repo_file_content = f.read()
        self.assertTrue(self.params['repoid'] in repo_file_content)

if __name__ == '__main__':
    unittest.main()