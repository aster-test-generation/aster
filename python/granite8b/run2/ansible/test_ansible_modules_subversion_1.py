import ansible.modules.subversion


class TestSubversion:
    def test_get_remote_revision(self):
        subversion = ansible.modules.subversion.Subversion(None, None, None, None, None, None, None, validate_certs=False)
        subversion.get_remote_revision()

    def test_has_local_mods(self):
        subversion = ansible.modules.subversion.Subversion(None, None, None, None, None, None, None, validate_certs=False)
        subversion.has_local_mods()

if __name__ == '__main__':
    unittest.main()