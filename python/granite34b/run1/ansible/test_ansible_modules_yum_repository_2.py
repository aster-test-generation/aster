import unittest
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.params = {
            'repoid': 'test_repo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'test_repo.repo',
            'dest': '/etc/yum.repos.d/test_repo.repo'
        }
        self.module.params = self.params
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.params)
        self.assertEqual(self.yum_repo.section, 'test_repo')
        self.assertEqual(self.yum_repo.params['dest'], '/etc/yum.repos.d/test_repo.repo')

    def test_dump(self):
        self.yum_repo.repofile.read_string("""
[test_repo]
name = Test Repo
baseurl = http://example.com/test_repo
enabled = 1
gpgcheck = 0
""")
        self.assertEqual(self.yum_repo.dump(), """
[test_repo]
baseurl = http://example.com/test_repo
enabled = 1
gpgcheck = 0
name = Test Repo

""")

if __name__ == '__main__':
    unittest.main()