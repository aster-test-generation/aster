import unittest
from ansible.modules.apt_repository import *



class TestAptRepository(unittest.TestCase):
    def test_apt_repository(self):
        self.assertEqual(apt_repository(), 'deb http://archive.ubuntu.com/ubuntu/ trusty main')

    def test_apt_repository_main(self):
        self.assertEqual(apt_repository_main(), True)

    def test_apt_repository_main_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

    def test_apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(self):
        self.assertEqual(apt_repository_main_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg_apt_pkg(), None)

class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_load(self):
        instance = SourcesList(None)
        instance.load(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_iter(self):
        instance = SourcesList(None)
        result = instance.__iter__()
        self.assertEqual(result, None)

    def test_len(self):
        instance = SourcesList(None)
        result = instance.__len__()
        self.assertEqual(result, 0)

    def test_getitem(self):
        instance = SourcesList(None)
        result = instance.__getitem__(None)
        self.assertEqual(result, None)

    def test_setitem(self):
        instance = SourcesList(None)
        instance.__setitem__(None, None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_delitem(self):
        instance = SourcesList(None)
        instance.__delitem__(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_contains(self):
        instance = SourcesList(None)
        result = instance.__contains__(None)
        self.assertEqual(result, False)

    def test_add_valid_source(self):
        instance = SourcesList(None)
        instance._add_valid_source(None, None, None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_remove_valid_source(self):
        instance = SourcesList(None)
        instance._remove_valid_source(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_add_source(self):
        instance = SourcesList(None)
        instance.add_source(None, None, None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_remove_source(self):
        instance = SourcesList(None)
        instance.remove_source(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_parse(self):
        instance = SourcesList(None)
        result = instance._parse(None, None)
        self.assertEqual(result, None)

    def test_choice(self):
        instance = SourcesList(None)
        result = instance._choice(None, None)
        self.assertEqual(result, None)

    def test_expand_path(self):
        instance = SourcesList(None)
        result = instance._expand_path(None)
        self.assertEqual(result, None)

    def test_suggest_filename(self):
        instance = SourcesList(None)
        result = instance._suggest_filename(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()