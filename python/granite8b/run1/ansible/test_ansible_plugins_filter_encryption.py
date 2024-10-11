import unittest
from ansible.plugins.filter.core import do_vault, do_unvault


class TestVaultFilter(unittest.TestCase):
    def test_do_vault(self):
        result = do_vault("Hello, World!", "my_secret")
        self.assertIsInstance(result, str)
        self.assertNotEqual(result, "Hello, World!")

    def test_do_unvault(self):
        vaulted_text = do_vault("Hello, World!", "my_secret")
        result = do_unvault(vaulted_text, "my_secret")
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()