import unittest
import yum_repository
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        module.params = {'repoid': 'test_repo', 'reposdir': '/etc/yum.repos.d'}
        yum_repo = YumRepo(module)
        self.assertEqual(yum_repo.section, 'test_repo')
        self.assertEqual(yum_repo.params['dest'], '/etc/yum.repos.d/test_repo.repo')

    def test_read_existing_repo_file(self):
        module = MagicMock()
        module.params = {'repoid': 'test_repo', 'reposdir': '/etc/yum.repos.d'}
        yum_repo = YumRepo(module)
        yum_repo.repofile.read(yum_repo.params['dest'])
        self.assertEqual(yum_repo.repofile.get(yum_repo.section, 'name'), 'test_repo')
        self.assertEqual(yum_repo.repofile.get(yum_repo.section, 'baseurl'), 'https://example.com/test_repo')

    def test_write_new_repo_file(self):
        module = MagicMock()
        module.params = {'repoid': 'test_repo', 'reposdir': '/etc/yum.repos.d', 'description': 'Test repo', 'baseurl': 'https://example.com/test_repo'}
        yum_repo = YumRepo(module)
        yum_repo.repofile.add_section(yum_repo.section)
        yum_repo.repofile.set(yum_repo.section, 'name', yum_repo.params['description'])
        yum_repo.repofile.set(yum_repo.section, 'baseurl', yum_repo.params['baseurl'])
        yum_repo.write()
        with open(yum_repo.params['dest'], 'r') as f:
            repo_file_content = f.read()
        self.assertIn('[test_repo]', repo_file_content)
        self.assertIn('name=Test repo', repo_file_content)
        self.assertIn('baseurl=https://example.com/test_repo', repo_file_content)

class TestYumRepository(unittest.TestCase):
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

if __name__ == '__main__':
    unittest.main()