import unittest
from ansible.plugins.filter.core import do_vault, do_unvault


class TestVaultFilter(unittest.TestCase):
    def test_vault_filter(self):
        result = do_vault("Hello, World!", "my_secret")
        self.assertEqual(result, "vault:hello, world!")

    def test_unvault_filter(self):
        result = do_unvault("vault:hello, world!", "my_secret")
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()