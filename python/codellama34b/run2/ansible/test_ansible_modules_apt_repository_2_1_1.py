import unittest
from ansible.modules.apt_repository import *


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        instance = SourcesList(None)
        self.assertIsNotNone(instance)

    def test_apt_cfg_dir(self):
        instance = SourcesList()
        result = instance._apt_cfg_dir('Dir::Etc::sourcelist')
        self.assertIsNotNone(result)

    def test_load(self):
        instance = SourcesList()
        instance.load('')

    def test_save(self):
        instance = SourcesList()
        instance.save()

    def test_dump(self):
        instance = SourcesList()
        result = instance.dump()
        self.assertIsNotNone(result)

    def test_choice(self):
        instance = SourcesList()
        result = instance._choice(None, None)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()