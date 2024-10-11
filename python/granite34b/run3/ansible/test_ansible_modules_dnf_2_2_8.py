import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(dnf_module.with_modules)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_ensure_dnf(self):
        locale = get_best_parsable_locale(self.module)
        os.environ['LC_ALL'] = os.environ['LC_MESSAGES'] = os.environ['LANG'] = locale
        global dnf
        try:
            import dnf
            import dnf.cli
            import dnf.const
            import dnf.exceptions
            import dnf.subject
            import dnf.util
            HAS_DNF = True
        except ImportError:
            HAS_DNF = False
        if HAS_DNF:
            return
        system_interpreters = ['/usr/libexec/platform-python', '/usr/bin/python3', '/usr/bin/python2', '/usr/bin/python']
        if not has_respawned():
            interpreter = probe_interpreters_for_module(system_interpreters, 'dnf')
            if interpreter:
                respawn_module(interpreter)
        self.module.fail_json(msg='Could not import the dnf python module using {0} ({1}). Please install `python3-dnf` or `python2-dnf` package or ensure you have specified the correct ansible_python_interpreter. (attempted {2})'.format(sys.executable, sys.version.replace('\n', ''), system_interpreters), results=[])

if __name__ == '__main__':
    unittest.main()