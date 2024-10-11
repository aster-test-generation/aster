from ansible.modules.systemd import is_running_service
import unittest
from ansible.module_utils.facts.system.chroot import is_chroot
from ansible.module_utils.service import sysv_exists, sysv_is_enabled, fail_if_missing
from ansible.module_utils._text import to_native


class TestSystemdModule(unittest.TestCase):
    def test_is_running_service(self):
        service_status = {
            'ActiveState': 'active'
        }
        self.assertTrue(is_running_service(service_status))

if __name__ == '__main__':
    unittest.main()