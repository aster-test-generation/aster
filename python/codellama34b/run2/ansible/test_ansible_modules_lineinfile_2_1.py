import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule()
        b_lines = []
        dest = "test"
        tmpfd, tmpfile = tempfile.mkstemp(dir=module.tmpdir)
        with os.fdopen(tmpfd, 'wb') as f:
            f.writelines(b_lines)
        validate = module.params.get('validate', None)
        valid = not validate
        if validate:
            if '%s' not in validate:
                module.fail_json(msg='validate must contain %%s: %s' % validate)
            rc, out, err = module.run_command(to_bytes(validate % tmpfile, errors='surrogate_or_strict'))
            valid = rc == 0
            if rc != 0:
                module.fail_json(msg='failed to validate: rc:%s error:%s' % (rc, err))
        if valid:
            module.atomic_move(tmpfile, to_native(os.path.realpath(to_bytes(dest, errors='surrogate_or_strict')), errors='surrogate_or_strict'), unsafe_writes=module.params['unsafe_writes'])

    def test_AnsibleModule(self):
        module = AnsibleModule()
        self.assertEqual(module.params, {})

    def test_AnsibleModule_exit_json(self):
        module = AnsibleModule()
        module.exit_json()

    def test_AnsibleModule_fail_json(self):
        module = AnsibleModule()
        module.fail_json()

    def test_AnsibleModule_run_command(self):
        module = AnsibleModule()
        rc, out, err = module.run_command("test")
        self.assertEqual(rc, 0)
        self.assertEqual(out, "")
        self.assertEqual(err, "")

    def test_AnsibleModule_atomic_move(self):
        module = AnsibleModule()
        module.atomic_move("test", "test")

    def test_AnsibleModule_get_bin_path(self):
        module = AnsibleModule()
        self.assertEqual(module.get_bin_path("test"), "test")

    def test_AnsibleModule_boolean(self):
        module = AnsibleModule()
        self.assertEqual(module.boolean("test"), False)

    def test_AnsibleModule_jsonify(self):
        module = AnsibleModule()
        self.assertEqual(module.jsonify("test"), "test")

    def test_AnsibleModule_from_json(self):
        module = AnsibleModule()
        self.assertEqual(module.from_json("test"), "test")

    def test_AnsibleModule_add_cleanup_file(self):
        module = AnsibleModule()
        module.add_cleanup_file("test")

    def test_AnsibleModule_do_cleanup_files(self):
        module = AnsibleModule()
        module.do_cleanup_files()

    def test_AnsibleModule_atomic_move_if_different(self):
        module = AnsibleModule()
        module.atomic_move_if_different("test", "test")

    def test_AnsibleModule_is_special_selinux_path(self):
        module = AnsibleModule()
        self.assertEqual(module.is_special_selinux_path("test"), False)

    def test_AnsibleModule_set_defaults(self):
        module = AnsibleModule()
        module.set_defaults()

    def test_AnsibleModule_load_params(self):
        module = AnsibleModule()
        module.load_params()

    def test_AnsibleModule_load_params_from_attributes(self):
        module = AnsibleModule()
        module.load_params_from_attributes()

if __name__ == '__main__':
    unittest.main()