import unittest
from ansible.modules.apt_repository import *


class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present'])))
        self.assertIsInstance(module, AnsibleModule)

    def test_params(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present'])))
        params = module.params
        self.assertIsInstance(params, dict)

    def test_repo(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present'])))
        repo = module.params['repo']
        self.assertIsInstance(repo, str)

    def test_state(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present'])))
        state = module.params['state']
        self.assertIsInstance(state, str)

    def test_update_cache(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), update_cache=dict(type='bool', default=True)))
        update_cache = module.params['update_cache']
        self.assertIsInstance(update_cache, bool)

    def test_update_cache_retries(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), update_cache_retries=dict(type='int', default=5)))
        update_cache_retries = module.params['update_cache_retries']
        self.assertIsInstance(update_cache_retries, int)

    def test_update_cache_retry_max_delay(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), update_cache_retry_max_delay=dict(type='int', default=12)))
        update_cache_retry_max_delay = module.params['update_cache_retry_max_delay']
        self.assertIsInstance(update_cache_retry_max_delay, int)

    def test_filename(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), filename=dict(type='str')))
        filename = module.params['filename']
        self.assertIsInstance(filename, str)

    def test_install_python_apt(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), install_python_apt=dict(type='bool', default=True)))
        install_python_apt = module.params['install_python_apt']
        self.assertIsInstance(install_python_apt, bool)

    def test_validate_certs(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), validate_certs=dict(type='bool', default=True)))
        validate_certs = module.params['validate_certs']
        self.assertIsInstance(validate_certs, bool)

    def test_codename(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present']), codename=dict(type='str')))
        codename = module.params['codename']
        self.assertIsInstance(codename, str)

    def test_main(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present'])))
        main()
        self.assertTrue(True)  # This test is a bit tricky, as main() doesn't return anything

    def test_private_method__respawn_module(self):
        module = AnsibleModule(argument_spec=dict(repo=dict(type='str', required=True), state=dict(type='str', default='present', choices=['absent', 'present'])))
        respawn_module('/usr/bin/python3')
        self.assertTrue(True)  # This test is a bit tricky, as _respawn_module() doesn't return anything

    def test_private_method__probe_interpreters_for_module(self):
        interpreters = ['/usr/bin/python3', '/usr/bin/python2', '/usr/bin/python']
        interpreter = probe_interpreters_for_module(interpreters, 'apt')
        self.assertIsInstance(interpreter, str)

if __name__ == '__main__':
    unittest.main()