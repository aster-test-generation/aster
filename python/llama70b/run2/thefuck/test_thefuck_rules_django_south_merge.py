import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestMatchFunction(unittest.TestCase):
    def test_match_true(self):
        command = type('Command', (), {'script': 'manage.py migrate', 'output': '--merge: will just attempt the migration'})
        result = match(command)
        self.assertTrue(result)

    def test_match_false_script(self):
        command = type('Command', (), {'script': 'manage.py runserver', 'output': '--merge: will just attempt the migration'})
        result = match(command)
        self.assertFalse(result)

    def test_match_false_output(self):
        command = type('Command', (), {'script': 'manage.py migrate', 'output': 'No such migration'})
        result = match(command)
        self.assertFalse(result)

class TestGetNewCommandFunction(unittest.TestCase):
    def test_get_new_command(self):
        command = type('Command', (), {'script': 'manage.py migrate'})
        result = get_new_command(command)
        self.assertEqual(result, u'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()