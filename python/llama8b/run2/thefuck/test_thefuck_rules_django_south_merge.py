import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestDjangoSouthMerge(unittest.TestCase):
    def test_match_command(self):
        command = 'manage.py migrate --merge: will just attempt the migration'
        self.assertTrue(match(command))

    def test_match_command_script(self):
        command = 'manage.py migrate --script'
        self.assertFalse(match(command))

    def test_match_command_output(self):
        command = 'manage.py migrate --merge'
        self.assertFalse(match(command))

    def test_get_new_command(self):
        command = 'manage.py migrate'
        new_command = get_new_command(command)
        self.assertEqual(new_command, 'manage.py migrate --merge')

    def test_get_new_command_script(self):
        command = 'manage.py migrate --script'
        new_command = get_new_command(command)
        self.assertEqual(new_command, 'manage.py migrate --script')

    def test_get_new_command_output(self):
        command = 'manage.py migrate --merge'
        new_command = get_new_command(command)
        self.assertEqual(new_command, 'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()