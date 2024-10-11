import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.sysctl import get_sysctl


class TestSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        module = MagicMock()
        prefixes = ['prefix1', 'prefix2']
        sysctl = get_sysctl(module, prefixes)
        self.assertEqual(sysctl, {'key1': 'value1', 'key2': 'value2'})

if __name__ == '__main__':
    unittest.main()