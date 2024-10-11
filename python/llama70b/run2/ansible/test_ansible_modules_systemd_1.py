import unittest
from ansible.modules.systemd import *


class TestSystemdModule(unittest.TestCase):
    def test___init__(self):
        from module import SystemdModule
        self.assertIsInstance(instance, SystemdModule)

    def test_run(self):
        from module import SystemdModule
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__load_params(self):
        from module import SystemdModule
        params = {'name': 'httpd', 'state': 'started'}
        instance._load_params(params)
        self.assertEqual(instance.name, 'httpd')
        self.assertEqual(instance.state, 'started')

    def test__execute_command(self):
        from module import SystemdModule
        command = 'systemctl start httpd'
        result = instance._execute_command(command)
        self.assertIsInstance(result, tuple)

    def test__systemdctl(self):
        from module import SystemdModule
        result = instance._systemdctl('start', 'httpd')
        self.assertIsInstance(result, tuple)

    def test__get_status(self):
        from module import SystemdModule
        result = instance._get_status('httpd')
        self.assertIsInstance(result, dict)

    def test__get_unit_info(self):
        from module import SystemdModule
        result = instance._get_unit_info('httpd')
        self.assertIsInstance(result, dict)

    def test__reload_daemon(self):
        from module import SystemdModule
        result = instance._reload_daemon()
        self.assertIsInstance(result, tuple)

    def test__reexecute_daemon(self):
        from module import SystemdModule
        result = instance._reexecute_daemon()
        self.assertIsInstance(result, tuple)

    def test__mask_unit(self):
        from module import SystemdModule
        result = instance._mask_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__unmask_unit(self):
        from module import SystemdModule
        result = instance._unmask_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__enable_unit(self):
        from module import SystemdModule
        result = instance._enable_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__disable_unit(self):
        from module import SystemdModule
        result = instance._disable_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__start_unit(self):
        from module import SystemdModule
        result = instance._start_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__stop_unit(self):
        from module import SystemdModule
        result = instance._stop_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__restart_unit(self):
        from module import SystemdModule
        result = instance._restart_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test__reload_unit(self):
        from module import SystemdModule
        result = instance._reload_unit('httpd')
        self.assertIsInstance(result, tuple)

    def test___str__(self):
        from module import SystemdModule
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from module import SystemdModule
        result = repr(instance)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()