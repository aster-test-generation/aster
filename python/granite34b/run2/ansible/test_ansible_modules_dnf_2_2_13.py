import unittest
from ansible.module_utils import dnf


class TestDnfModule(unittest.TestCase):
    def test_is_installed(self):
        module = DnfModule(None)
        module.base = MagicMock()
        module.base.sack = MagicMock()
        module.base.sack.query = MagicMock()
        module.base.sack.query.installed = MagicMock()
        installed = module.base.sack.query.installed()
        installed.filter = MagicMock()
        installed.filter.return_value = True
        package_spec = {'name': 'example_package'}
        result = module._is_installed('example_package')
        self.assertTrue(result)
        installed.filter.assert_called_with(**package_spec)

if __name__ == '__main__':
    unittest.main()