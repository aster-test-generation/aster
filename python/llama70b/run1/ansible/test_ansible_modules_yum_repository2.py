import unittest
from ansible.modules.yum_repository import YumRepo

class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)

    def test_private_method__init__(self):
        self.yum_repo.__init__(self.module)
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)

    def test_protected_method__parse_params(self):
        self.yum_repo._YumRepo__parse_params()
        # assert something about the parsed params

    def test_magic_method__str__(self):
        self.assertIsInstance(str(self.yum_repo), str)

    def test_magic_method__repr__(self):
        self.assertIsInstance(repr(self.yum_repo), str)

    def test_magic_method__eq__(self):
        other_yum_repo = YumRepo(self.module)
        self.assertTrue(self.yum_repo == other_yum_repo)

    def test_section(self):
        self.assertEqual(self.yum_repo.section, self.module.params['repoid'])

    def test_repos_dir(self):
        self.assertEqual(self.yum_repo.repos_dir, self.module.params['reposdir'])

    def test_dest(self):
        self.assertEqual(self.yum_repo.dest, os.path.join(self.module.params['reposdir'], '%s.repo' % self.module.params['file']))

    def test_repofile_read(self):
        self.yum_repo.repofile.read(self.yum_repo.dest)
        # assert something about the read repofile

class MockModule:
    def __init__(self):
        self.params = {
            'repoid': 'test_repo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'test_repo',
        }

if __name__ == '__main__':
    unittest.main()