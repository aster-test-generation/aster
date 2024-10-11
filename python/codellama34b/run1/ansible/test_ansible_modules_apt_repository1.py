import unittest
from ansible.modules.apt_repository import *

class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList(None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_apt_cfg_dir(self):
        instance = SourcesList(None)
        result = instance._apt_cfg_dir('Dir::Etc::sourcelist')
        self.assertEqual(result, None)

    def test_load(self):
        instance = SourcesList(None)
        instance.load('')
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_save(self):
        instance = SourcesList(None)
        instance.save()
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_dump(self):
        instance = SourcesList(None)
        result = instance.dump()
        self.assertEqual(result, {})
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

    def test_choice(self):
        instance = SourcesList(None)
        result = instance._choice(None, None)
        self.assertEqual(result, None)
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.new_repos, set())
        self.assertEqual(instance.default_file, None)

if __name__ == '__main__':
    unittest.main()