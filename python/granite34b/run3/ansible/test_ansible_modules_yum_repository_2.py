import unittest
import yum_repository


class TestYumRepo(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        module.params = {'repoid': 'test_repo', 'reposdir': '/etc/yum.repos.d'}
        yum_repo = YumRepo(module)
        self.assertEqual(yum_repo.module, module)
        self.assertEqual(yum_repo.params, module.params)
        self.assertEqual(yum_repo.section, 'test_repo')
        self.assertEqual(yum_repo.params['dest'], '/etc/yum.repos.d/test_repo.repo')

    def test_dump(self):
        module = MagicMock()
        module.params = {'repoid': 'test_repo', 'reposdir': '/etc/yum.repos.d'}
        yum_repo = YumRepo(module)
        yum_repo.repofile = configparser.ConfigParser()
        yum_repo.repofile.read_string("""
[test_repo]
name=Test Repo
baseurl=http://example.com/test_repo
enabled=1
gpgcheck=0
""")
        expected_dump = """
[test_repo]
baseurl = http://example.com/test_repo
enabled = 1
gpgcheck = 0
name = Test Repo

"""
        self.assertEqual(yum_repo.dump(), expected_dump)

if __name__ == '__main__':
    unittest.main()