import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match(self):
        self.assertTrue(match(Command('manage.py migrate --merge', 'will just attempt the migration')))
        self.assertFalse(match(Command('manage.py migrate', '')))

    def test_get_new_command(self):
        self.assertEqual(get_new_command(Command('manage.py migrate --merge', '')), 'manage.py migrate --merge: will just attempt the migration')

if __name__ == '__main__':
    unittest.main()