import unittest
from ansible.modules.pip import *

class TestPipModule(unittest.TestCase):
    def test_get_packages(self):
        module = AnsibleModule()
        pip = ['pip']
        chdir = '/path/to/directory'
        command, out, err = _get_packages(module, pip, chdir)
        self.assertEqual(command, 'pip list --format=freeze')
        self.assertEqual(out, 'list of packages')
        self.assertEqual(err, 'error message')

if __name__ == '__main__':
    unittest.main()