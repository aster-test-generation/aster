import unittest
from ansible.config.manager import *



class TestPlugin(unittest.TestCase):
    def test_plugin(self):
        instance = Plugin("name", "type")
        self.assertEqual(instance.name, "name")
        self.assertEqual(instance.type, "type")

class TestSetting(unittest.TestCase):
    def test_setting(self):
        instance = Setting("name", "value", "origin", "type")
        self.assertEqual(instance.name, "name")
        self.assertEqual(instance.value, "value")
        self.assertEqual(instance.origin, "origin")
        self.assertEqual(instance.type, "type")


if __name__ == '__main__':
    unittest.main()