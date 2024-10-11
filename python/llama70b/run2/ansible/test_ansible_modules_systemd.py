import unittest
from ansible.modules.systemd import *


class TestSystemdModule(unittest.TestCase):
    def test_main(self):
        module = AnsibleModule(argument_spec=dict(name=dict(type='str', aliases=['service', 'unit']), state=dict(type='str', choices=['reloaded', 'restarted', 'started', 'stopped']), enabled=dict(type='bool'), force=dict(type='bool'), masked=dict(type='bool'), daemon_reload=dict(type='bool', default=False, aliases=['daemon-reload']), daemon_reexec=dict(type='bool', default=False, aliases=['daemon-reexec']), scope=dict(type='str', default='system', choices=['system', 'user', 'global']), no_block=dict(type='bool', default=False)), supports_check_mode=True, required_one_of=[['state', 'enabled', 'masked', 'daemon_reload', 'daemon_reexec']], required_by=dict(state=('name',), enabled=('name',), masked=('name',)))
        result = module.main()
        self.assertIsInstance(result, dict)

    def test_parse_systemctl_show(self):
        out = "ActiveEnterTimestamp=Sun 2016-05-15 18:28:49 EDT\nActiveEnterTimestampMonotonic=8135942\n"
        result = parse_systemctl_show(out.split('\n'))
        self.assertIsInstance(result, dict)
        self.assertIn('ActiveEnterTimestamp', result)
        self.assertIn('ActiveEnterTimestampMonotonic', result)

    def test_request_was_ignored(self):
        out = "Failed to parse bus message"
        self.assertTrue(request_was_ignored(out))
        out = "Success"
        self.assertFalse(request_was_ignored(out))

    def test_is_running_service(self):
        status = {'ActiveState': 'active'}
        self.assertTrue(is_running_service(status))
        status = {'ActiveState': 'inactive'}
        self.assertFalse(is_running_service(status))

    def test_is_deactivating_service(self):
        status = {'ActiveState': 'deactivating'}
        self.assertTrue(is_deactivating_service(status))
        status = {'ActiveState': 'active'}
        self.assertFalse(is_deactivating_service(status))

    def test_fail_if_missing(self):
        module = AnsibleModule(argument_spec=dict())
        unit = 'test_unit'
        msg = 'host'
        fail_if_missing(module, True, unit, msg)
        self.assertTrue(True)  # no exception raised
        fail_if_missing(module, False, unit, msg)
        self.assertRaises(SystemExit)

    def test__private_method(self):
        module = AnsibleModule(argument_spec=dict())
        result = module._AnsibleModule__private_method()  # test private method
        self.assertIsNone(result)

    def test__protected_method(self):
        module = AnsibleModule(argument_spec=dict())
        result = module._AnsibleModule__protected_method()  # test protected method
        self.assertIsNone(result)

    def test___init__(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(module, AnsibleModule)

    def test___str__(self):
        module = AnsibleModule(argument_spec=dict())
        result = str(module)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        module = AnsibleModule(argument_spec=dict())
        result = repr(module)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        module1 = AnsibleModule(argument_spec=dict())
        module2 = AnsibleModule(argument_spec=dict())
        self.assertTrue(module1 == module2)

if __name__ == '__main__':
    unittest.main()