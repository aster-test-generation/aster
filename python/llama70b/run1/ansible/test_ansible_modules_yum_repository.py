import unittest
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)

    def test_add(self):
        self.yum_repo.add()
        self.assertTrue(self.yum_repo.repofile.has_section(self.yum_repo.section))

    def test_private_method__init_repofile(self):
        self.yum_repo._YumRepo__init_repofile()
        self.assertIsInstance(self.yum_repo.repofile, configparser.ConfigParser)

    def test_protected_method__read_repofile(self):
        self.yum_repo._read_repofile()
        self.assertTrue(os.path.isfile(self.yum_repo.params['dest']))

    def test_magic_method__str__(self):
        self.assertEqual(str(self.yum_repo), "YumRepo")

    def test_magic_method__repr__(self):
        self.assertEqual(repr(self.yum_repo), "YumRepo(module=MockModule)")

    def test_magic_method__eq__(self):
        other_yum_repo = YumRepo(self.module)
        self.assertEqual(self.yum_repo, other_yum_repo)

class MockModule:
    def __init__(self):
        self.params = {'repoid': 'test', 'reposdir': '/tmp', 'file': 'test.repo'}

    def fail_json(self, msg):
        raise Exception(msg)

if __name__ == '__main__':
    unittest.main()