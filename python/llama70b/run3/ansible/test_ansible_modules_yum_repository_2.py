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

    def test_add_required_params(self):
        self.yum_repo.params['baseurl'] = None
        self.yum_repo.params['metalink'] = None
        self.yum_repo.params['mirrorlist'] = None
        with self.assertRaises(SystemExit):
            self.yum_repo.add()

    def test_add_list_params(self):
        self.yum_repo.params['includepkgs'] = ['pkg1', 'pkg2']
        self.yum_repo.add()
        self.assertEqual(self.yum_repo.repofile.get(self.yum_repo.section, 'includepkgs'), 'pkg1 pkg2')

    def test_add_bool_params(self):
        self.yum_repo.params['enabled'] = True
        self.yum_repo.add()
        self.assertEqual(self.yum_repo.repofile.get(self.yum_repo.section, 'enabled'), '1')

    def test__init_private_method(self):
        self.yum_repo._YumRepo__init_private_method()
        self.assertTrue(hasattr(self.yum_repo, '_private_attr'))

    def test__str_magic_method(self):
        self.assertEqual(str(self.yum_repo), 'YumRepo instance')

    def test__repr_magic_method(self):
        self.assertEqual(repr(self.yum_repo), 'YumRepo(module=MockModule)')

    def test__eq_magic_method(self):
        other_yum_repo = YumRepo(self.module)
        self.assertEqual(self.yum_repo, other_yum_repo)

class MockModule:
    def __init__(self):
        self.params = {}

if __name__ == '__main__':
    unittest.main()