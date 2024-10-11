import unittest
from thefuck.rules import django_south_merge


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match(self):
        from unittest.mock import Mock
        result = django_south_merge.match(command)
        self.assertTrue(result)

    def test_match_false(self):
        from unittest.mock import Mock
        result = django_south_merge.match(command)
        self.assertFalse(result)

    def test_get_new_command(self):
        from unittest.mock import Mock
        result = django_south_merge.get_new_command(command)
        self.assertEqual(result, u'manage.py migrate --merge')

class TestMagicMethods(unittest.TestCase):
    def test_module_repr(self):
        result = repr(django_south_merge)
        self.assertIsInstance(result, str)

    def test_module_str(self):
        result = str(django_south_merge)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()