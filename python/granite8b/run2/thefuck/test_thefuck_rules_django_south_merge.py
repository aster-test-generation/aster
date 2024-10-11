import unittest
from thefuck.rules.django_south_merge import match, get_new_command


class TestMatch(unittest.TestCase):
    def test_match_with_merge_option(self):
        command = Command(script='manage.py migrate --merge', output='')
        self.assertTrue(match(command))

    def test_match_without_merge_option(self):
        command = MagicMock(script='manage.py migrate', output='')
        self.assertFalse(match(command))

    def test_match_with_merge_option_in_output(self):
        command = Command(script='manage.py migrate', output='migrate: will just attempt the migration')
        self.assertTrue(match(command))

    def test_match_without_merge_option_in_output(self):
        command = MagicMock(script='manage.py migrate', output='migrate: will not attempt the migration')
        self.assertFalse(match(command))

class TestGetNewCommand(unittest.TestCase):
    def test_get_new_command(self):
        command = MagicMock(script='manage.py migrate', output='')
        new_command = get_new_command(command)
        self.assertEqual(new_command, 'manage.py migrate --merge')

if __name__ == '__main__':
    unittest.main()