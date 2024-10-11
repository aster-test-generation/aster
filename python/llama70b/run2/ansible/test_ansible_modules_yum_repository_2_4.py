import unittest
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()
        self.yum_repo = YumRepo(self.module)

    def test_init(self):
        self.assertIsInstance(self.yum_repo, YumRepo)
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, self.module.params['repoid'])

    def test_remove(self):
        self.yum_repo.repofile = MockRepofile()
        self.yum_repo.repofile.has_section.return_value = True
        self.yum_repo.remove()
        self.yum_repo.repofile.remove_section.assert_called_once_with(self.yum_repo.section)

    def test_remove_no_section(self):
        self.yum_repo.repofile = MockRepofile()
        self.yum_repo.repofile.has_section.return_value = False
        self.yum_repo.remove()
        self.yum_repo.repofile.remove_section.assert_not_called()

    def test___init__(self):
        # Test private method __init__
        yum_repo = YumRepo(MockModule())
        self.assertIsInstance(yum_repo, YumRepo)

    def test___str__(self):
        # Test magic method __str__
        self.assertEqual(str(self.yum_repo), "YumRepo")

    def test___repr__(self):
        # Test magic method __repr__
        self.assertEqual(repr(self.yum_repo), "YumRepo(module=MockModule())")

    def test___eq__(self):
        # Test magic method __eq__
        other_yum_repo = YumRepo(MockModule())
        self.assertEqual(self.yum_repo, other_yum_repo)

    def test__read_repofile(self):
        # Test protected method _read_repofile
        self.yum_repo._read_repofile()
        self.yum_repo.repofile.read.assert_called_once_with(self.yum_repo.params['dest'])

class MockModule:
    def __init__(self):
        self.params = {'repoid': 'test', 'reposdir': '/etc/yum.repos.d', 'file': 'test.repo'}

class MockRepofile:
    def __init__(self):
        self.sections = []

    def has_section(self, section):
        return section in self.sections

    def remove_section(self, section):
        self.sections.remove(section)

    def read(self, filename):
        pass

if __name__ == '__main__':
    unittest.main()