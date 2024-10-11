import unittest
from ansible.modules.subversion import *


class TestSubversion(unittest.TestCase):
    def test_get_remote_revision(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.get_remote_revision()
        self.assertEqual(result, None)

    def test_has_local_mods(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.has_local_mods()
        self.assertEqual(result, None)

    def test_needs_update(self):
        instance = Subversion(None, None, None, None, None, None, None, None)
        result = instance.needs_update()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()