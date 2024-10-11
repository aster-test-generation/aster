from ansible.plugins.become import BecomeModule
import unittest
from ansible.plugins.become import BecomeBase


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        instance = BecomeModule()
        result = instance.build_become_command('echo "hello"', 'bash')
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=] password:" -u  echo "hello"')

if __name__ == '__main__':
    unittest.main()