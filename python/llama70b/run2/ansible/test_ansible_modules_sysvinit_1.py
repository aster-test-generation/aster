import unittest
from ansible.modules.sysvinit import *


class TestSysVinitModule(unittest.TestCase):
    def test___init__(self):
        from module import SysVinitModule
        self.assertIsInstance(instance, AnsibleModule)

    def test_main(self):
        from module import SysVinitModule
        result = instance.main()
        self.assertEqual(result, {'failed': False, 'changed': False, 'results': {}})

    def test__get_service_status(self):
        from module import SysVinitModule
        result = instance._get_service_status('apache2')
        self.assertIsInstance(result, dict)

    def test__get_service_enabled(self):
        from module import SysVinitModule
        result = instance._get_service_enabled('apache2')
        self.assertIsInstance(result, bool)

    def test__start_service(self):
        from module import SysVinitModule
        result = instance._start_service('apache2')
        self.assertIsInstance(result, dict)

    def test__stop_service(self):
        from module import SysVinitModule
        result = instance._stop_service('apache2')
        self.assertIsInstance(result, dict)

    def test__restart_service(self):
        from module import SysVinitModule
        result = instance._restart_service('apache2')
        self.assertIsInstance(result, dict)

    def test__reload_service(self):
        from module import SysVinitModule
        result = instance._reload_service('apache2')
        self.assertIsInstance(result, dict)

    def test__enable_service(self):
        from module import SysVinitModule
        result = instance._enable_service('apache2')
        self.assertIsInstance(result, dict)

    def test__disable_service(self):
        from module import SysVinitModule
        result = instance._disable_service('apache2')
        self.assertIsInstance(result, dict)

    def test___str__(self):
        from module import SysVinitModule
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from module import SysVinitModule
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()