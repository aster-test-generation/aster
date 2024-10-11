import unittest
from ansible.modules.apt_repository import *



class TestAptRepository(unittest.TestCase):
    def test_apt_repository(self):
        from apt_repository import AptRepository
        result = instance.apt_repository()
        self.assertEqual(result, None)

    def test_main(self):
        from apt_repository import AptRepository
        result = instance.main()
        self.assertEqual(result, None)

    def test_get_apt_instances(self):
        from apt_repo import AptRepository
        result = instance.get_apt_instances()
        self.assertEqual(result, None)

    def test_get_apt_architecture(self):
        from apt_repo import AptRepository
        result = instance.get_apt_architecture()
        self.assertEqual(result, None)

    def test_get_codename(self):
        from apt_repository import AptRepository
        result = instance.get_codename()
        self.assertEqual(result, None)

    def test_get_apt_sources_dir(self):
        from apt_repo import AptRepository
        result = instance.get_apt_sources_dir()
        self.assertEqual(result, None)

    def test_get_apt_sources_list_dir(self):
        from apt_repository import AptRepository
        result = instance.get_apt_sources_list_dir()
        self.assertEqual(result, None)

    def test_get_apt_preferences_dir(self):
        from apt_repository import AptRepository
        result = instance.get_apt_preferences_dir()
        self.assertEqual(result, None)

    def test_get_apt_sources_list(self):
        from apt_repository import AptRepository
        result = instance.get_apt_sources_list()
        self.assertEqual(result, None)

    def test_get_apt_preferences(self):
        from apt_repository import AptRepository
        result = instance.get_apt_preferences()
        self.assertEqual(result, None)

    def test_get_apt_config(self):
        from apt_repository import AptRepository
        result = instance.get_apt_config()
        self.assertEqual(result, None)

    def test_get_apt_dir(self):
        from apt_repository import AptRepository
        result = instance.get_apt_dir()
        self.assertEqual(result, None)

    def test_get_apt_autoremove(self):
        from apt_repository import AptRepository
        result = instance.get_apt_autoremove()
        self.assertEqual(result, None)

    def test_get_apt_update_cache(self):
        from apt_repository import AptRepository
        result = instance.get_apt_update_cache()
        self.assertEqual(result, None)

    def test_get_apt_cache(self):
        from apt_repository import AptRepository
        result = instance.get_apt_cache()
        self.assertEqual(result, None)

    def test_get_apt_pkg(self):
        from apt_repo import AptRepository
        result = instance.get_apt_pkg()
        self.assertEqual(result, None)

    def test_get_apt_fix_broken(self):
        from apt_repo import AptRepository
        result = instance.get_apt_fix_broken()
        self.assertEqual(result, None)

    def test_get_apt_sources_list_path(self):
        from apt_repo import AptRepository
        result = instance.get_apt_sources_list_path()
        self.assertEqual(result, None)

    def test_get_apt_preferences_path(self):
        from apt_repository import AptRepository
        result = instance.get_apt_preferences_path()
        self.assertEqual(result, None)

    def test_get_apt_sources_list_d_path(self):
        from apt_repository import AptRepository
        result = instance.get_apt_sources_list_d_path()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()