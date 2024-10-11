import unittest
from thefuck.rules.django_south_merge import *


class TestMatch(unittest.TestCase):
    def test_match(self):
        command = Command('manage.py migrate', 'manage.py migrate --merge: will just attempt the migration')
        result = match(command)
        self.assertTrue(result)

    def test_match_false(self):
        command = Command('manage.py migrate', 'manage.py migrate')
        result = match(command)
        self.assertFalse(result)

class TestGetNewCommand(unittest.TestCase):
    def test_get_new_command(self):
        command = Command('manage.py migrate', 'manage.py migrate --merge: will just attempt the migration')
        result = get_new_command(command)
        self.assertEqual(result, 'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()