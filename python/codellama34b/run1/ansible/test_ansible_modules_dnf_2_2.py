import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.dnf import DnfModule


__metaclass__ = type

class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = DnfModule(None)

    def test_ensure(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        self.module.ensure()
        self.assertEqual(response, {'msg': '', 'changed': False, 'results': [], 'rc': 0})

    def test_ensure_2(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        self.module.names = []
        self.module.autoremove = True
        self.module.state = 'absent'
        self.module.ensure()
        self.assertEqual(response, {'msg': '', 'changed': False, 'results': [], 'rc': 0})

    def test_ensure_3(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        self.module.names = ['*']
        self.module.state = 'latest'
        self.module.ensure()
        self.assertEqual(response, {'msg': '', 'changed': False, 'results': [], 'rc': 0})

    def test_ensure_4(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        self.module.names = ['httpd']
        self.module.state = 'latest'
        self.module.ensure()
        self.assertEqual(response, {'msg': '', 'changed': False, 'results': [], 'rc': 0})

    def test_ensure_5(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        self.module.names = ['httpd>=2.4']
        self.module.state = 'present'
        self.module.ensure()
        self.assertEqual(response, {'msg': '', 'changed': False, 'results': [], 'rc': 0})

    def test_ensure_6(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        self.module.names = ['httpd', 'mariadb-server']
        self.module.state = 'latest'
        self.module.ensure()
        self.assertEqual(response, {'msg': '', 'changed': False, 'results': [], 'rc': 0})

if __name__ == '__main__':
    unittest.main()