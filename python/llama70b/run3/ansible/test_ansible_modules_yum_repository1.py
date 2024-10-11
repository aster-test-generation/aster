import unittest
from ansible.modules.yum_repository import YumRepo

class TestYumRepo(unittest.TestCase):
    def test_init(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        self.assertIsInstance(yum_repo, YumRepo)

    def test_save(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        yum_repo.repofile = MockRepofile()
        yum_repo.save()
        self.assertTrue(yum_repo.repofile.write.called)

    def test_save_empty_repo(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        yum_repo.repofile = MockRepofile(sections=[])
        yum_repo.save()
        self.assertTrue(os.remove.called)

    def test_private_method__init__(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        self.assertIsInstance(yum_repo.module, MockModule)

    def test_protected_method__save(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        yum_repo._YumRepo__save()
        self.assertTrue(yum_repo.repofile.write.called)

    def test_magic_method__str__(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        self.assertIsInstance(str(yum_repo), str)

    def test_magic_method__repr__(self):
        module = MockModule()
        yum_repo = YumRepo(module)
        self.assertIsInstance(repr(yum_repo), str)

class MockModule:
    def __init__(self):
        self.params = {'repoid': 'test', 'reposdir': '/tmp', 'file': 'test.repo'}

class MockRepofile:
    def __init__(self, sections=None):
        self.sections = sections if sections is not None else ['test']

    def write(self, fd):
        self.write.called = True

    def read(self, filename):
        pass

if __name__ == '__main__':
    unittest.main()