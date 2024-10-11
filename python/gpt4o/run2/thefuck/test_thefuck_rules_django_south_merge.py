import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match_with_correct_command(self):
        command = type('Command', (object,), {
            'script': 'manage.py migrate',
            'output': '--merge: will just attempt the migration'
        })()
        result = match(command)
        self.assertTrue(result)

    def test_match_with_incorrect_script(self):
        command = type('Command', (object,), {
            'script': 'other_script.py migrate',
            'output': '--merge: will just attempt the migration'
        })()
        result = match(command)
        self.assertFalse(result)

    def test_match_with_incorrect_output(self):
        command = type('Command', (object,), {
            'script': 'manage.py migrate',
            'output': 'some other output'
        })()
        result = match(command)
        self.assertFalse(result)

    def test_get_new_command(self):
        command = type('Command', (object,), {
            'script': 'manage.py migrate'
        })()
        result = get_new_command(command)
        self.assertEqual(result, 'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()