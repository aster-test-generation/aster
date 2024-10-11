import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match(self):
        self.assertTrue(match(Command('manage.py migrate --merge', '')))
        self.assertFalse(match(Command('manage.py migrate', '')))
        self.assertFalse(match(Command('manage.py migrate --fake', '')))

    def test_get_new_command(self):
        self.assertEqual(get_new_command(Command('manage.py migrate --merge', '')), 'manage.py migrate --noinput --merge')

if __name__ == '__main__':
    unittest.main()