import unittest
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl_method(self):
        prefixes = ['prefix1', 'prefix2']
        result = get_sysctl(prefixes=prefixes)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()