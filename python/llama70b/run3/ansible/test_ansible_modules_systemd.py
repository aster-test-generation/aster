import unittest
from ansible.modules.systemd import *


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(name=dict(type='str', aliases=['service', 'unit']), state=dict(type='str', choices=['reloaded', 'restarted', 'started', 'stopped']), enabled=dict(type='bool'), force=dict(type='bool'), masked=dict(type='bool'), daemon_reload=dict(type='bool', default=False, aliases=['daemon-reload']), daemon_reexec=dict(type='bool', default=False, aliases=['daemon-reexec']), scope=dict(type='str', default='system', choices=['system', 'user', 'global']), no_block=dict(type='bool', default=False)), supports_check_mode=True, required_one_of=[['state', 'enabled', 'masked', 'daemon_reload', 'daemon_reexec']], required_by=dict(state=('name',), enabled=('name',), masked=('name',)))
        self.assertIsInstance(module, AnsibleModule)

    def test_main(self):
        module = AnsibleModule(argument_spec=dict(name=dict(type='str', aliases=['service', 'unit']), state=dict(type='str', choices=['reloaded', 'restarted', 'started', 'stopped']), enabled=dict(type='bool'), force=dict(type='bool'), masked=dict(type='bool'), daemon_reload=dict(type='bool', default=False, aliases=['daemon-reload']), daemon_reexec=dict(type='bool', default=False, aliases=['daemon-reexec']), scope=dict(type='str', default='system', choices=['system', 'user', 'global']), no_block=dict(type='bool', default=False)), supports_check_mode=True, required_one_of=[['state', 'enabled', 'masked', 'daemon_reload', 'daemon_reexec']], required_by=dict(state=('name',), enabled=('name',), masked=('name',)))
        result = main()
        self.assertIsInstance(result, dict)

    def test_request_was_ignored(self):
        out = "some output"
        err = "some error"
        self.assertFalse(request_was_ignored(out))
        self.assertFalse(request_was_ignored(err))

    def test_parse_systemctl_show(self):
        out = "some output"
        result = parse_systemctl_show(out.split('\n'))
        self.assertIsInstance(result, dict)

    def test_is_running_service(self):
        status = {"ActiveState": "active"}
        self.assertTrue(is_running_service(status))

    def test_is_deactivating_service(self):
        status = {"ActiveState": "deactivating"}
        self.assertTrue(is_deactivating_service(status))

    def test_fail_if_missing(self):
        module = AnsibleModule(argument_spec=dict(name=dict(type='str', aliases=['service', 'unit']), state=dict(type='str', choices=['reloaded', 'restarted', 'started', 'stopped']), enabled=dict(type='bool'), force=dict(type='bool'), masked=dict(type='bool'), daemon_reload=dict(type='bool', default=False, aliases=['daemon-reload']), daemon_reexec=dict(type='bool', default=False, aliases=['daemon-reexec']), scope=dict(type='str', default='system', choices=['system', 'user', 'global']), no_block=dict(type='bool', default=False)), supports_check_mode=True, required_one_of=[['state', 'enabled', 'masked', 'daemon_reload', 'daemon_reexec']], required_by=dict(state=('name',), enabled=('name',), masked=('name',)))
        fail_if_missing(module, True, "some_service", "host")

    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(name=dict(type='str', aliases=['service', 'unit']), state=dict(type='str', choices=['reloaded', 'restarted', 'started', 'stopped']), enabled=dict(type='bool'), force=dict(type='bool'), masked=dict(type='bool'), daemon_reload=dict(type='bool', default=False, aliases=['daemon-reload']), daemon_reexec=dict(type='bool', default=False, aliases=['daemon-reexec']), scope=dict(type='str', default='system', choices=['system', 'user', 'global']), no_block=dict(type='bool', default=False)), supports_check_mode=True, required_one_of=[['state', 'enabled', 'masked', 'daemon_reload', 'daemon_reexec']], required_by=dict(state=('name',), enabled=('name',), masked=('name',)))
        self.assertIsInstance(module, AnsibleModule)

if __name__ == '__main__':
    unittest.main()