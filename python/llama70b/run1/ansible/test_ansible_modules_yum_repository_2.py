import unittest
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        from unittest import mock
        self.module.params = {'repoid': 'test', 'reposdir': '/etc/yum.repos.d', 'file': 'test'}
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, 'test')
        self.assertEqual(self.yum_repo.params['dest'], '/etc/yum.repos.d/test.repo')

    def test_private_method__read_repofile(self):
        self.yum_repo.repofile = mock.Mock()
        self.yum_repo._YumRepo__read_repofile()
        self.yum_repo.repofile.read.assert_called_with('/etc/yum.repos.d/test.repo')

    def test_protected_method__write_repofile(self):
        self.yum_repo.repofile = mock.Mock()
        self.yum_repo._write_repofile()
        self.yum_repo.repofile.write.assert_called_with('/etc/yum.repos.d/test.repo')

    def test_magic_method__str__(self):
        self.assertEqual(str(self.yum_repo), 'YumRepo(test)')

    def test_magic_method__repr__(self):
        self.assertEqual(repr(self.yum_repo), 'YumRepo(module=<Mock id=\'...\'>, params={\'repoid\': \'test\', ...})')

    def test_magic_method__eq__(self):
        other_yum_repo = YumRepo(self.module)
        self.assertEqual(self.yum_repo, other_yum_repo)

    def test_state_present(self):
        self.yum_repo.params['state'] = 'present'
        self.yum_repo.run()
        # assert that the repo file is created/updated

    def test_state_absent(self):
        self.yum_repo.params['state'] = 'absent'
        self.yum_repo.run()
        # assert that the repo file is deleted

class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)

    def test__init_private_method(self):
        self.yum_repo.__init__(self.module)
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)

    def test_section_property(self):
        self.yum_repo.params = {'repoid': 'test_repo'}
        self.assertEqual(self.yum_repo.section, 'test_repo')

    def test_repos_dir_property(self):
        self.yum_repo.params = {'reposdir': '/path/to/repos'}
        self.assertEqual(self.yum_repo.repos_dir, '/path/to/repos')

    def test_dest_property(self):
        self.yum_repo.params = {'file': 'test_repo', 'reposdir': '/path/to/repos'}
        self.assertEqual(self.yum_repo.dest, '/path/to/repos/test_repo.repo')

    def test_read_repofile(self):
        self.yum_repo.repofile = MockRepofile()
        self.yum_repo.read_repofile('/path/to/test_repo.repo')
        self.yum_repo.repofile.read.assert_called_once_with('/path/to/test_repo.repo')

    def test_fail_json(self):
        self.yum_repo.module.fail_json = Mock()
        self.yum_repo.fail_json('Repo directory does not exist.')
        self.yum_repo.module.fail_json.assert_called_once_with(msg='Repo directory does not exist.')

class MockModule:
    def __init__(self):
        self.params = {}

    def fail_json(self, msg):
        pass

class MockRepofile:
    def read(self, path):
        pass

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