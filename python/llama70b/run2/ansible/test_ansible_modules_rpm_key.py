import unittest
from ansible.modules.rpm_key import RpmKey, is_pubkey, main


class TestRpmKey(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        self.assertIsInstance(rpm_key, RpmKey)

    def test_fetch_key(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        url = 'http://example.com/key.gpg'
        keyfile = rpm_key.fetch_key(url)
        self.assertTrue(os.path.isfile(keyfile))

    def test_normalize_keyid(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        keyid = '0x12345678'
        normalized_keyid = rpm_key.normalize_keyid(keyid)
        self.assertEqual(normalized_keyid, '12345678')

    def test_getkeyid(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        keyfile = 'path/to/key.gpg'
        keyid = rpm_key.getkeyid(keyfile)
        self.assertIsNotNone(keyid)

    def test_getfingerprint(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        keyfile = 'path/to/key.gpg'
        fingerprint = rpm_key.getfingerprint(keyfile)
        self.assertIsNotNone(fingerprint)

    def test_is_keyid(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        keystr = '0x12345678'
        self.assertTrue(rpm_key.is_keyid(keystr))

    def test_execute_command(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        cmd = ['gpg', '--version']
        stdout, stderr = rpm_key.execute_command(cmd)
        self.assertIsNotNone(stdout)

    def test_is_key_imported(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        keyid = '12345678'
        self.assertFalse(rpm_key.is_key_imported(keyid))

    def test_import_key(self):
        module = AnsibleModule(argument_spec=dict(state=dict(type='str', default='present', choices=['absent', 'present']),
                                                    key=dict(type='str', required=True, no_log=False),
                                                    fingerprint=dict(type='str'),
                                                    validate_certs=dict(type='bool', default=True)),
                               supports_check_mode=True)
        rpm_key = RpmKey(module)
        keyfile = 'path/to/key.gpg'
        rpm_key.import_key(keyfile)

if __name__ == '__main__':
    unittest.main()