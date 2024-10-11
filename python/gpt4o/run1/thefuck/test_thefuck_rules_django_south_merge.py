import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match_with_valid_command(self):
        class Command:
            script = 'manage.py migrate'
            output = '--merge: will just attempt the migration'
        
        command = Command()
        result = match(command)
        self.assertTrue(result)

    def test_match_with_invalid_script(self):
        class Command:
            script = 'other_script.py migrate'
            output = '--merge: will just attempt the migration'
        
        command = Command()
        result = match(command)
        self.assertFalse(result)

    def test_match_with_invalid_output(self):
        class Command:
            script = 'manage.py migrate'
            output = 'some other output'
        
        command = Command()
        result = match(command)
        self.assertFalse(result)

    def test_get_new_command(self):
        class Command:
            script = 'manage.py migrate'
        
        command = Command()
        result = get_new_command(command)
        self.assertEqual(result, 'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()