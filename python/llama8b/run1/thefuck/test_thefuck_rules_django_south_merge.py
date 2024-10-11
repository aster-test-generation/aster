import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match(self):
        command = {'script': 'manage.py migrate --merge: will just attempt the migration'}
        self.assertTrue(match(command))

    def test_match_no_merge(self):
        command = {'script': 'manage.py migrate'}
        self.assertFalse(match(command))

    def test_match_no_manage(self):
        command = {'script': 'migrate --merge: will just attempt the migration'}
        self.assertFalse(match(command))

    def test_get_new_command(self):
        command = {'script': 'manage.py migrate'}
        new_command = get_new_command(command)
        self.assertEqual(new_command, 'manage.py migrate --merge')

    def test_get_new_command_empty_script(self):
        command = {'script': ''}
        with self.assertRaises(AttributeError):
            get_new_command(command)

    def test_get_new_command_no_script(self):
        command = {}
        with self.assertRaises(AttributeError):
            get_new_command(command)

if __name__ == '__main__':
    unittest.main()