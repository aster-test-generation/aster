import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestMatch(unittest.TestCase):
    def test_match(self):
        self.assertTrue(match(Command(script='manage.py migrate app', output='')))
        self.assertFalse(match(Command(script='manage.py migrate app', output='')))

    def test_not_match(self):
        self.assertFalse(match(Command(script='manage.py migrate app', output='')))
        self.assertFalse(match(Command(script='manage.py migrate app', output='')))

class TestGetNewCommand(unittest.TestCase):
    def test_get_new_command(self):
        self.assertEqual(get_new_command(Command(script='manage.py migrate app', output='')), 'manage.py migrate app --merge')

if __name__ == '__main__':
    unittest.main()