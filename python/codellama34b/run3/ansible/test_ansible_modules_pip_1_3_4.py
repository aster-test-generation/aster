import unittest
from ansible.modules.pip import *


class TestPip(unittest.TestCase):
    def test_get_packages(self):
        module = AnsibleModule(argument_spec={})
        pip = ['pip']
        chdir = '/tmp'
        result = _get_packages(module, pip, chdir)
        self.assertEqual(result, (' '.join(pip), out, err))

if __name__ == '__main__':
    unittest.main()