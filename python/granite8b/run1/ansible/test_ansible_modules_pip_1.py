import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip


class TestPip(unittest.TestCase):
    def test_get_package_info(self):
        pip = Pip()
        self.assertEqual(pip._get_package_info('setuptools'), 'setuptools')
        self.assertEqual(pip._get_package_info('pip'), 'pip')

if __name__ == '__main__':
    unittest.main()