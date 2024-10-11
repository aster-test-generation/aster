import unittest
from thefuck.rules.django_south_merge import *


class TestMatch(unittest.TestCase):
    def test_match(self):
        command = Command(script='manage.py migrate --merge')
        result = match(command)
        self.assertTrue(result)

    def test_match_fail(self):
        from django.core.management import Command
        result = match(command)
        self.assertFalse(result)

class TestGetNewCommand(unittest.TestCase):
    def test_get_new_command(self):
        command = Command(script='manage.py migrate --merge')
        result = get_new_command(command)
        self.assertEqual(result, 'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()