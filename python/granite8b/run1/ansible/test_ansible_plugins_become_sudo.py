import unittest
from ansible.plugins.become import BecomeModule


class TestBecomeModule(unittest.TestCase):
    def test_build_become_command(self):
        become_module = BecomeModule()
        become_module.name = 'sudo'
        become_module.fail = ('Sorry, try again.',)
        become_module.missing = ('Sorry, a password is required to run sudo', 'sudo: a password is required')
        become_module.get_option = lambda x: None
        become_module.prompt = '[sudo via ansible, key=%s] password:' % become_module._id
        become_module._build_success_command = lambda x, y: ' '.join([x, y])
        result = become_module.build_become_command('cmd', 'shell')
        self.assertEqual(result, 'sudo -p "[sudo via ansible, key=] password:" cmd')

if __name__ == '__main__':
    unittest.main()