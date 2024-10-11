import unittest
from ansible.modules.command import *



class TestCommandModule(unittest.TestCase):
    def test_main(self):
        self.assertEqual(main(), 0)

    def test_check_command(self):
        self.assertEqual(check_command(), '{"result": "success"}')

    def test_run_command(self):
        self.assertEqual(run_command(), None)

    def test_AnsibleModule(self):
        self.assertEqual(AnsibleModule(argument_spec=dict()), None)

    def test_AnsibleModule_exit_json(self):
        self.assertEqual(AnsibleModule(argument_spec=dict()).exit_json(), None)

    def test_AnsibleModule_fail_json(self):
        self.assertEqual(AnsibleModule(argument_spec=dict()).fail_json(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule().get_bin_path(), None)

    def test_AnsibleModule_get_bin_path(self):
        self.assertEqual(AnsibleModule(argument_spec={}).get_bin_path(), None)

if __name__ == '__main__':
    unittest.main()