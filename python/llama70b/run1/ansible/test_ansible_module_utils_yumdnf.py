import unittest
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestYumDnf(unittest.TestCase):
    def test___init__(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.module, module)

    def test_allow_downgrade(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.allow_downgrade, False)

    def test_autoremove(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.autoremove, False)

    def test_bugfix(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.bugfix, False)

    def test_cacheonly(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.cacheonly, False)

    def test_conf_file(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.conf_file, None)

    def test_disable_excludes(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.disable_excludes, None)

    def test_disable_gpg_check(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.disable_gpg_check, False)

    def test_disable_plugin(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.disable_plugin, [])

    def test_disablerepo(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.disablerepo, [])

    def test_download_only(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.download_only, False)

    def test_download_dir(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.download_dir, None)

    def test_enable_plugin(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.enable_plugin, [])

    def test_enablerepo(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.enablerepo, [])

    def test_exclude(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.exclude, [])

    def test_installroot(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.installroot, "/")

    def test_install_repoquery(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.install_repoquery, True)

    def test_install_weak_deps(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.install_weak_deps, True)

    def test_list(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.list, None)

    def test_names(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.names, [])

    def test_releasever(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.releasever, None)

    def test_security(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.security, False)

    def test_skip_broken(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.skip_broken, False)

    def test_state(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.state, None)

    def test_update_only(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.update_only, False)

    def test_update_cache(self):
        module = object()  # mock module object
        instance = YumDnf(module)
        self.assertEqual(instance.update_cache, False)

if __name__ == '__main__':
    unittest.main()