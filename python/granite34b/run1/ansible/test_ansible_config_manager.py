import os
import unittest
from ansible.config.manager import (
    find_ini_config_file,
    _add_base_defs_deprecations,
)


class TestAnsibleConfigManager(unittest.TestCase):
    def test_find_ini_config_file(self):
        warnings = set()
        path = find_ini_config_file(warnings)
        self.assertIsInstance(path, str)
        self.assertTrue(os.path.exists(path))
        self.assertTrue(os.access(path, os.R_OK))

    def test__add_base_defs_deprecations(self):
        base_defs = {
            'section1': {
                'deprecated': {'version': '1.0', 'reason': 'test'},
                'ini': [{'deprecated': {'version': '1.0', 'reason': 'test'}}],
                'env': [{'deprecated': {'version': '1.0', 'reason': 'test'}}],
                'vars': [{'deprecated': {'version': '1.0', 'reason': 'test'}}],
            },
            'section2': {
                'ini': [{'deprecated': {'version': '1.0', 'reason': 'test'}}],
                'env': [{'deprecated': {'version': '1.0', 'reason': 'test'}}],
                'vars': [{'deprecated': {'version': '1.0', 'reason': 'test'}}],
            },
        }
        _add_base_defs_deprecations(base_defs)
        for section in base_defs.values():
            self.assertEqual(section['deprecated']['collection_name'], 'ansible.legacy')
            for subsection in ('ini', 'env', 'vars'):
                if subsection in section:
                    for entry in section[subsection]:
                        self.assertEqual(entry['deprecated']['collection_name'], 'ansible.builtin')

if __name__ == '__main__':
    unittest.main()