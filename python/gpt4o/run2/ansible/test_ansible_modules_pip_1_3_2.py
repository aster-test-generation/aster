import unittest
from ansible.modules.pip import _recover_package_name


class TestPipModule(unittest.TestCase):
    def test_recover_package_name_single(self):
        result = _recover_package_name(['bottle'])
        self.assertEqual(result, ['bottle'])

    def test_recover_package_name_multiple(self):
        result = _recover_package_name(['bottle', 'django'])
        self.assertEqual(result, ['bottle', 'django'])

    def test_recover_package_name_with_version_specifiers(self):
        result = _recover_package_name(['bottle>0.10,<0.20,!=0.11'])
        self.assertEqual(result, ['bottle>0.10,<0.20,!=0.11'])

    def test_recover_package_name_with_brackets(self):
        result = _recover_package_name(['bottle[extra]'])
        self.assertEqual(result, ['bottle[extra]'])

    def test_recover_package_name_with_multiple_brackets(self):
        result = _recover_package_name(['bottle[extra1,extra2]'])
        self.assertEqual(result, ['bottle[extra1,extra2]'])

    def test_recover_package_name_with_mixed(self):
        result = _recover_package_name(['bottle[extra1,extra2]', 'django>1.11.0,<1.12.0'])
        self.assertEqual(result, ['bottle[extra1,extra2]', 'django>1.11.0,<1.12.0'])

    def test_is_package_name_true(self):
        result = _is_package_name('bottle')
        self.assertTrue(result)

    def test_is_package_name_false(self):
        result = _is_package_name('bottle==0.12')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()