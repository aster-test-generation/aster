import unittest
from thefuck.rules.django_south_merge import match, get_new_command
from colorama import Command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match_with_valid_command(self):
        command = Command(script='python manage.py migrate', output='--merge: will just attempt the migration')
        result = match(command)
        self.assertTrue(result)

    def test_match_with_invalid_script(self):
        command = Command(script='python other_script.py migrate', output='--merge: will just attempt the migration')
        result = match(command)
        self.assertFalse(result)

    def test_match_with_invalid_output(self):
        command = Command(script='python manage.py migrate', output='some other output')
        result = match(command)
        self.assertFalse(result)

    def test_get_new_command(self):
        command = Command(script='python manage.py migrate', output='--merge: will just attempt the migration')
        result = get_new_command(command)
        self.assertEqual(result, 'python manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()